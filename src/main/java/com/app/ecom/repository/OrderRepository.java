/***************************************************************************
 * COPYRIGHT (C) 2012-2026, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package com.app.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ecom.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
