package com.kodilla.quotes.service;

import com.kodilla.quotes.model.Quote;
import com.kodilla.quotes.repository.QuoteRepository;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

  private static final int MAX_QUOTES = 20;
  private final Random random = new Random();
  private final QuoteRepository quoteRepository;

  public QuoteService(QuoteRepository quoteRepository) {
    this.quoteRepository = quoteRepository;
  }

  public Quote getRandomQuote() {
    return quoteRepository.findById((long) random.nextInt(MAX_QUOTES) + 1).orElse(null);
  }

}
