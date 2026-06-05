package androidx.work.impl.workers;

import ac.d;
import ac.n;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c8.i;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import mh.g;
import t.m1;
import t0.j;
import t7.f;
import t7.m;
import u0.c;
import u0.l;
import u6.v;
import u6.z;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: z, reason: collision with root package name */
    public static final String f1261z = m.l("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(j jVar, g gVar, d dVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i iVar = (i) obj;
            c8.d dVarZ = dVar.z(iVar.f3121a);
            Integer numValueOf = dVarZ != null ? Integer.valueOf(dVarZ.f3114b) : null;
            String str2 = iVar.f3121a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f15363b;
            z zVarG = z.g(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                zVarG.R(1);
            } else {
                zVarG.k(1, str2);
            }
            workDatabase_Impl.b();
            Cursor cursorN = l.n(workDatabase_Impl, zVarG);
            try {
                ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    arrayList2.add(cursorN.getString(0));
                }
                cursorN.close();
                zVarG.l();
                ArrayList arrayListR = gVar.r(iVar.f3121a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListR);
                String str3 = iVar.f3121a;
                String str4 = iVar.f3123c;
                switch (iVar.f3122b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sbM = m1.m("\n", str3, "\t ", str4, "\t ");
                sbM.append(numValueOf);
                sbM.append("\t ");
                sbM.append(str);
                sbM.append("\t ");
                sbM.append(strJoin);
                sbM.append("\t ");
                sbM.append(strJoin2);
                sbM.append("\t");
                sb2.append(sbM.toString());
            } catch (Throwable th2) {
                cursorN.close();
                zVarG.l();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final t7.l doWork() throws Throwable {
        z zVar;
        d dVar;
        j jVar;
        g gVar;
        int i10;
        WorkDatabase workDatabase = k.p0(getApplicationContext()).f16842d;
        n nVarW = workDatabase.w();
        j jVarU = workDatabase.u();
        g gVarX = workDatabase.x();
        d dVarT = workDatabase.t();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        nVarW.getClass();
        z zVarG = z.g(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        zVarG.v(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarW.f406a;
        workDatabase_Impl.b();
        Cursor cursorN = l.n(workDatabase_Impl, zVarG);
        try {
            int iM = c.m(cursorN, "required_network_type");
            int iM2 = c.m(cursorN, "requires_charging");
            int iM3 = c.m(cursorN, "requires_device_idle");
            int iM4 = c.m(cursorN, "requires_battery_not_low");
            int iM5 = c.m(cursorN, "requires_storage_not_low");
            int iM6 = c.m(cursorN, "trigger_content_update_delay");
            int iM7 = c.m(cursorN, "trigger_max_content_delay");
            int iM8 = c.m(cursorN, "content_uri_triggers");
            int iM9 = c.m(cursorN, "id");
            int iM10 = c.m(cursorN, "state");
            int iM11 = c.m(cursorN, "worker_class_name");
            zVar = zVarG;
            try {
                int iM12 = c.m(cursorN, "input_merger_class_name");
                int iM13 = c.m(cursorN, "input");
                int iM14 = c.m(cursorN, "output");
                int iM15 = c.m(cursorN, "initial_delay");
                int iM16 = c.m(cursorN, "interval_duration");
                int iM17 = c.m(cursorN, "flex_duration");
                int iM18 = c.m(cursorN, "run_attempt_count");
                int iM19 = c.m(cursorN, "backoff_policy");
                int iM20 = c.m(cursorN, "backoff_delay_duration");
                int iM21 = c.m(cursorN, "period_start_time");
                int iM22 = c.m(cursorN, "minimum_retention_duration");
                int iM23 = c.m(cursorN, "schedule_requested_at");
                int iM24 = c.m(cursorN, "run_in_foreground");
                int iM25 = c.m(cursorN, "out_of_quota_policy");
                int i11 = iM14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    String string = cursorN.getString(iM9);
                    int i12 = iM9;
                    String string2 = cursorN.getString(iM11);
                    int i13 = iM11;
                    t7.c cVar = new t7.c();
                    int i14 = iM;
                    cVar.f16102a = v.L(cursorN.getInt(iM));
                    cVar.f16103b = cursorN.getInt(iM2) != 0;
                    cVar.f16104c = cursorN.getInt(iM3) != 0;
                    cVar.f16105d = cursorN.getInt(iM4) != 0;
                    cVar.f16106e = cursorN.getInt(iM5) != 0;
                    int i15 = iM2;
                    int i16 = iM3;
                    cVar.f16107f = cursorN.getLong(iM6);
                    cVar.f16108g = cursorN.getLong(iM7);
                    cVar.f16109h = v.l(cursorN.getBlob(iM8));
                    i iVar = new i(string, string2);
                    iVar.f3122b = v.N(cursorN.getInt(iM10));
                    iVar.f3124d = cursorN.getString(iM12);
                    iVar.f3125e = f.a(cursorN.getBlob(iM13));
                    int i17 = i11;
                    iVar.f3126f = f.a(cursorN.getBlob(i17));
                    int i18 = iM10;
                    int i19 = iM15;
                    iVar.f3127g = cursorN.getLong(i19);
                    int i20 = iM16;
                    int i21 = iM12;
                    iVar.f3128h = cursorN.getLong(i20);
                    int i22 = iM4;
                    int i23 = iM17;
                    iVar.f3129i = cursorN.getLong(i23);
                    int i24 = iM18;
                    iVar.f3130k = cursorN.getInt(i24);
                    int i25 = iM19;
                    int i26 = iM13;
                    iVar.f3131l = v.K(cursorN.getInt(i25));
                    int i27 = iM20;
                    iVar.f3132m = cursorN.getLong(i27);
                    int i28 = iM21;
                    iVar.f3133n = cursorN.getLong(i28);
                    int i29 = iM22;
                    iVar.f3134o = cursorN.getLong(i29);
                    int i30 = iM23;
                    iVar.f3135p = cursorN.getLong(i30);
                    int i31 = iM24;
                    iVar.f3136q = cursorN.getInt(i31) != 0;
                    int i32 = iM25;
                    iVar.f3137r = v.M(cursorN.getInt(i32));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    iM18 = i24;
                    iM12 = i21;
                    iM16 = i20;
                    iM21 = i28;
                    iM4 = i22;
                    i11 = i17;
                    iM24 = i31;
                    iM2 = i15;
                    iM15 = i19;
                    iM13 = i26;
                    iM17 = i23;
                    iM19 = i25;
                    iM22 = i29;
                    iM20 = i27;
                    iM11 = i13;
                    iM = i14;
                    iM25 = i32;
                    iM23 = i30;
                    iM10 = i18;
                    iM9 = i12;
                    iM3 = i16;
                }
                cursorN.close();
                zVar.l();
                ArrayList arrayListC = nVarW.c();
                ArrayList arrayListA = nVarW.a();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f1261z;
                if (zIsEmpty) {
                    dVar = dVarT;
                    jVar = jVarU;
                    gVar = gVarX;
                    i10 = 0;
                } else {
                    i10 = 0;
                    m.g().i(str, "Recently completed work:\n\n", new Throwable[0]);
                    dVar = dVarT;
                    jVar = jVarU;
                    gVar = gVarX;
                    m.g().i(str, a(jVar, gVar, dVar, arrayList), new Throwable[0]);
                }
                if (!arrayListC.isEmpty()) {
                    m.g().i(str, "Running work:\n\n", new Throwable[i10]);
                    m.g().i(str, a(jVar, gVar, dVar, arrayListC), new Throwable[i10]);
                }
                if (!arrayListA.isEmpty()) {
                    m.g().i(str, "Enqueued work:\n\n", new Throwable[i10]);
                    m.g().i(str, a(jVar, gVar, dVar, arrayListA), new Throwable[i10]);
                }
                return new t7.k(f.f16114c);
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                zVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zVar = zVarG;
        }
    }
}
