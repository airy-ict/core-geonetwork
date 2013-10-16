package org.fao.geonet.domain;

import javax.persistence.*;

/**
 * An entity representing a system configuration setting.
 * <p/>
 * Settings are represented by a tree. One should use the {@link org.fao.geonet.repository.HarvesterSettingRepository} to traverse the
 * hierarchy.
 *
 * @author Jesse
 */
@Entity
@Table(name = "settings")
@Cacheable
@Access(AccessType.PROPERTY)
public class Setting extends GeonetEntity {
    private String name;
    private String value;
    private SettingDataType dataType;
    private int position;

    @Id
    @Column(name = "name", nullable = false, length = 512)
    public String getName() {
        return name;
    }

    public Setting setName(String name) {
        this.name = name;
        return this;
    }

    @Lob
    @Column(name = "value", nullable = true)
    public String getValue() {
        return value;
    }

    public Setting setValue(String value) {
        this.value = value;
        return this;
    }

    @Column(name = "datatype")
    public SettingDataType getDataType() {
        return dataType;
    }

    public Setting setDataType(SettingDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    public int getPosition() {
        return position;
    }

    public Setting setPosition(int position) {
        this.position = position;
        return this;
    }


}
