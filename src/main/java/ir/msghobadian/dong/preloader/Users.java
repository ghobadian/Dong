package ir.msghobadian.dong.preloader;

import ir.msghobadian.dong.model.PersonEntity;

public class Users {
    public final static PersonEntity ali = PersonEntity.builder().studentId(1L).firstName("ali").lastName("borhani").build();
    public final static PersonEntity mohammadSadegh = PersonEntity.builder().studentId(2L).firstName("mohammad sadegh").lastName("ghobadian").build();
    public final static PersonEntity saeed = PersonEntity.builder().studentId(3L).firstName("saeed").lastName("zahedi").build();
    public final static PersonEntity mohammadMehdi = PersonEntity.builder().studentId(4L).firstName("mohammad mehdi").lastName("beiromi").build();
    public final static PersonEntity hossein = PersonEntity.builder().studentId(5L).firstName("hossein").lastName("yasbolaghi sharahi").build();
    public final static PersonEntity amirHossein = PersonEntity.builder().studentId(6L).firstName("amir hossein").lastName("zeinal langarudi").build();
}
