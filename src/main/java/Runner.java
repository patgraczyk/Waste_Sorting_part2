import db.DBBin;
import db.DBHelper;
import models.Bins.*;
import models.Rubbish.ConversionFactor;
import models.Rubbish.Organic.OrganicNonPackaged;
import models.Rubbish.Organic.OrganicPackaged;
import models.Rubbish.PieceOfRubbish;
import models.Rubbish.Plastic.HDPE;
import models.Rubbish.Plastic.PET1;
import models.Rubbish.Plastic.Vegware;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Compost compost1;
        Glass glass1;
        Landfill landfill1;
        MixedRecycling mixedRecycling1;
        PET1 pet1;
        HDPE hdpe1;
        Vegware vegware1;
        OrganicNonPackaged nonPackagedOrganic1;
        OrganicPackaged packagedOrganic1;


        compost1 = new Compost("compost", 50, "Thursday");
        glass1 = new Glass("glass", 70, "Monday");
        landfill1 = new Landfill("landfill waste", 60, "Tuesday");
        mixedRecycling1 = new MixedRecycling("recycling", 30, "Monday");
        pet1 = new PET1("straw", 1, 15, "PET", ConversionFactor.PET1);
        hdpe1 = new HDPE( "Cup", 1, 30, "HDPE", ConversionFactor.HDPE);
        vegware1 = new Vegware("plastic fork", 2, 40, "Vegware", ConversionFactor.VEGWARE);
        nonPackagedOrganic1 = new OrganicNonPackaged("Apple", 5, 50);
        packagedOrganic1 = new OrganicPackaged("bluberries in container", 1, 200);


        DBHelper.save(compost1);
        DBHelper.save(glass1);
        DBHelper.save(landfill1);
        DBHelper.save(mixedRecycling1);
        DBHelper.save(pet1);
        DBHelper.save(hdpe1);
        DBHelper.save(vegware1);
        DBHelper.save(nonPackagedOrganic1);
        DBHelper.save(packagedOrganic1);

        DBBin.addRubbishToBin(pet1, mixedRecycling1);
        DBBin.addRubbishToBin(hdpe1, mixedRecycling1);
        DBBin.addRubbishToBin(vegware1, compost1);

        List<PieceOfRubbish> rubbishInsideTheBin = DBBin.getListOfRubbish(mixedRecycling1);
    }
}
