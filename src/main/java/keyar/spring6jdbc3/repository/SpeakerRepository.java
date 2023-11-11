package keyar.spring6jdbc3.repository;

import keyar.spring6jdbc3.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();

    Speaker create(Speaker speaker);

    Speaker getSpeaker(int id);

    Speaker update(Speaker speaker);

    void update(List<Object[]> pairs);

    void delete(int id);
}
