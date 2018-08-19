package db;

import models.Bins.Bin;
import models.Rubbish.PieceOfRubbish;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBBin {

    private static Session session;

    public static void addRubbishToBin(PieceOfRubbish pieceOfRubbish, Bin bin){
    bin.addToBin(pieceOfRubbish);
    DBHelper.update(bin);
    }

    public static List<PieceOfRubbish> getListOfRubbish(Bin bin) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<PieceOfRubbish> results = null;
        try {
            Criteria cr = session.createCriteria(PieceOfRubbish.class);
            cr.createAlias("bins", "bin");
            cr.add(Restrictions.eq("bin.id", bin.getId()));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
