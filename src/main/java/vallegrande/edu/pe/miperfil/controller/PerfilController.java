package vallegrande.edu.pe.miperfil.controller;

import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {
    private PerfilView view;
    public  PerfilController(PerfilView view){
        this.view = view;
        view.getBtnMostrar().setOnAction( e -> mostrarPerfil());

        view.getBtnLimpiar().setOnAction(event -> {
            view.getTxtNombre().clear();
            view.getTxtCarrera().clear();
            view.getTxtSemestre().clear();
            view.getTxtPasatiempo().clear();
            view.getTxtMeta().clear();
            view.getLblResultado().setText("");
        });
    }
    private void mostrarPerfil(){
        String nombre = view.getTxtNombre().getText();
        String carrera = view.getTxtCarrera().getText();
        String semestre = view.getTxtSemestre().getText();
        String pasatiempo = view.getTxtPasatiempo().getText();
        String meta = view.getTxtMeta().getText();
        Perfil perfil = new Perfil(
                nombre,
                carrera,
                semestre,
                pasatiempo,
                meta
        );

        view.getLblResultado().setText(
                perfil.obtenerPresentacion()
        );

    }
}