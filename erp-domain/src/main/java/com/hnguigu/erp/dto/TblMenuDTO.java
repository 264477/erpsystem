package com.hnguigu.erp.dto;

import com.hnguigu.erp.entity.TblMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblMenuDTO extends TblMenu {

    private Set<TblMenu> tblMenuSet=new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblMenuDTO that = (TblMenuDTO) o;
        return Objects.equals(tblMenuSet, that.tblMenuSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tblMenuSet);
    }
}
