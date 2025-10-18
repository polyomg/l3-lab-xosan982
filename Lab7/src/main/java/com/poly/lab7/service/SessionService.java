package com.poly.lab7.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SessionService {

    @Autowired
    private HttpSession session;

    public void set(String name, Object value) {
        session.setAttribute(name, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String name) {
        return (T) session.getAttribute(name);
    }

    public Object getRaw(String name) {
        return session.getAttribute(name);
    }

    public void remove(String name) {
        session.removeAttribute(name);
    }

    public boolean exists(String name) {
        return session.getAttribute(name) != null;
    }
}