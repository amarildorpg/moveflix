package br.com.moveflix.service;

import br.com.moveflix.entity.Streaming;
import br.com.moveflix.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreamingService {
    private  final StreamingRepository repository;

    public List<Streaming> findAll() {
        return repository.findAll();
    }

    public Optional<Streaming> findById(Long id) {
        return repository.findById(id);
    }

    public Streaming save(Streaming streaming) {
        return repository.save(streaming);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
