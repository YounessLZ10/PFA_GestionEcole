package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Notes;
import ma.xproce.pfa_gestion_ecole.dao.repositories.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService implements NotesManager {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes ajouterNote(Notes note) {
        try {
            return notesRepository.save(note);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public boolean supprimerNote(Notes note) {
        try {
            notesRepository.delete(note);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerNoteParId(Integer id) {
        try {
            notesRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Notes modifierNote(Notes note) {
        try {
            return notesRepository.save(note);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Notes trouverNoteParId(Integer id) {
        try {
            return notesRepository.findById(Long.valueOf(id)).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Notes> listerToutesLesNotes() {
        try {
            return notesRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Notes> trouverNotesParEtudiant(Integer idEtudiant) {
        try {
            return notesRepository.findByEtudiant_IdEtudiant(idEtudiant);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Notes> trouverNotesParMatiere(Integer idMatiere) {
        try {
            return notesRepository.findByIdMatiere(idMatiere);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Notes> trouverNotesParEtudiantEtMatiere(Integer idEtudiant, Integer idMatiere) {
        try {
            return notesRepository.findByEtudiant_IdEtudiantAndIdMatiere(idEtudiant, idMatiere);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }
}