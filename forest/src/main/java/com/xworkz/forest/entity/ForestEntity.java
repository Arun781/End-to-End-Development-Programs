package com.xworkz.forest.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "forestinfo")
@NamedQuery(name = "findAreaByName", query = "select entity.area from ForestEntity entity where entity.name='Nallamalla'")
@NamedQuery(name = "findByName", query = "select dp from ForestEntity dp where dp.name='conifer forest'")
@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity where entity.state='Telangana'")
@NamedQuery(name = "findByNameAndStateAndArea", query = "select en from ForestEntity en where en.name='Araku'and en.state='AP'and en.area='1428'")
@NamedQuery(name = "findByNameAndState", query = "select bt from ForestEntity bt where bt.name='KGF'and bt.state='Karnataka'")
@NamedQuery(name = "findNameById", query = "select beg.name from ForestEntity beg where beg.id='5'")
@NamedQuery(name = "findStateByNameAndArea", query = "select en.state from ForestEntity en where en.name='Simhadri'and en.area='1400'")
@NamedQuery(name = "findCount", query = "select count (en) from ForestEntity en")
@NamedQuery(name = "findMaxArea", query = "select max (db.area) from ForestEntity db")
public class ForestEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "state")
	private String state;
	@Column(name = "type")
	private String type;
	@Column(name = "area")
	private Double area;

}
