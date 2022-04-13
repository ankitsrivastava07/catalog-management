package catalogManagement.convertor;
import catalogManagement.dao.elastic.book.bookentity.ElasticBookEntity;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ObjectConvertor {
    public static ModelMapper modelMapper = new ModelMapper();

    public static <D> D dtoToEntityConversion(Object source,Class<D> destination){
        return modelMapper.map(source,destination);
    }

    public static <D> List<D> entityToDtoConversion(List<ElasticBookEntity> objectList, Class<D> destination){
        return objectList.stream().map(e-> modelMapper.map(e,destination)).collect(Collectors.toList());
    }

    public static <D> D entityToDtoConversion(Object source,Class<D> destinationType){
        return modelMapper.map(source,destinationType);
    }
}
