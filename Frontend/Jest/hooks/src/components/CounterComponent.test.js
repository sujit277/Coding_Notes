import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import CounterComponent from './CounterComponent';

describe('CounterComponent', () => {
  test('should display the initial count', () => {
    render(<CounterComponent />);
    expect(screen.getByText(/Count:/)).toHaveTextContent('Count: 0');
  });

  test('should increment the count on button click', () => {
    render(<CounterComponent />);
    fireEvent.click(screen.getByText('Increment'));
    expect(screen.getByText(/Count:/)).toHaveTextContent('Count: 1');
  });

  test('should decrement the count on button click', () => {
    render(<CounterComponent />);
    fireEvent.click(screen.getByText('Decrement'));
    expect(screen.getByText(/Count:/)).toHaveTextContent('Count: -1');
  });
});
