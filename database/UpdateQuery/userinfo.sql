select * from safety;

select cctv_ist_in from safety where cctv_ist_in = '(null)' and safetyid like 'KW%';

select a.cctv_ist_yn, a.cctv_ist_total, a.cctv_ist_in, a.cctv_ist_out, a.kindername, b.clsrarea
from safety a, classarea b where a.safetyid = b.classid and a.safetyid like 'KW%';


select spcn_thcnt, kindername from teacher where spcn_thcnt=1;