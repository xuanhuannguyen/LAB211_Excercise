/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5.Ex1.Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ReservationList {
    private ArrayList<Reservation> reservationList ;

    public ReservationList() {
        reservationList = new ArrayList<>();
    }
    
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }
    
    public Reservation isExist(String id) {
        for (Reservation reservation : reservationList) {
            if (reservation.getBookingID().equalsIgnoreCase(id)) return reservation;
        }
        return null;
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
    public void deleteReservation(Reservation reservation) {
        this.reservationList.remove(reservation);
    }
    
}
