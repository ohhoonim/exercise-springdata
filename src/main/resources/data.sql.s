
select 
 tabl.relname as table_name
 , attr.attnum
 , attr.attname
 , tp.typname
 , case when attr.atttypmod > 0 then attr.atttypmod - 4 else 0 end 
 , attr.attnotnull
 , de.description
from pg_class tabl
join pg_attribute as attr
on tabl.oid = attr.attrelid
join pg_type tp
on attr.atttypid = tp.oid
left outer join pg_description de
on tabl.oid = de.objoid and attr.attnum = de.objsubid
where tabl.relname='para_note'
    and attr.attnum > 0
order by attr.attnum;
