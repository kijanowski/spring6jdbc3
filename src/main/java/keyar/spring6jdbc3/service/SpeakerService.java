package keyar.spring6jdbc3.service;

import keyar.spring6jdbc3.model.Speaker;
import keyar.spring6jdbc3.repository.SpeakerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public Speaker create(Speaker speaker) {
        return speakerRepository.create(speaker);
    }

    public Speaker getSpeaker(int id) {
        return speakerRepository.getSpeaker(id);
    }

    public Speaker update(Speaker speaker) {
        return speakerRepository.update(speaker);
    }

    public void batch() {
        List<Speaker> speakers = speakerRepository.findAll();

        List<Object[]> pairs = new ArrayList<>();

        for(Speaker speaker: speakers) {
            Object [] tmp = {"Java", speaker.getId()};
            pairs.add(tmp);
        }

        speakerRepository.update(pairs);
    }

    public void delete(int id) {
        speakerRepository.delete(id);
    }
}
