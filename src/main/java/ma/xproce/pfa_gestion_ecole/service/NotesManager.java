package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Notes;

import java.util.List;

public interface NotesManager {
    Notes ajouterNote(Notes note);
    boolean supprimerNote(Notes note);
    boolean supprimerNoteParId(Integer id);
    Notes modifierNote(Notes note);
    Notes trouverNoteParId(Integer id);
    List<Notes> listerToutesLesNotes();
    List<Notes> trouverNotesParEtudiant(Integer idEtudiant);
    List<Notes> trouverNotesParMatiere(Integer idMatiere);
    List<Notes> trouverNotesParEtudiantEtMatiere(Integer idEtudiant, Integer idMatiere);
}