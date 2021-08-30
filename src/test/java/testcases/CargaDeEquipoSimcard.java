package testcases;

import CargaDeDatos.pageobject.pages.EBSHome;

import org.junit.Test;



public class CargaDeEquipoSimcard extends TestBase {

    protected EBSHome home;

    @Test
    public void CargaDeEquipos(){
        home = new EBSHome(driver);
        home.goToUrl("http://junin.novaltepre.corp:8003/");
    }

}
