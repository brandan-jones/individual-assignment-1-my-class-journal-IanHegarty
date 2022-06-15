package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalService implements IJournalService{

    List<JournalEntry> journalEntries = new ArrayList<>();
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
