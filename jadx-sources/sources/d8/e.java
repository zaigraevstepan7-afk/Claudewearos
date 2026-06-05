package d8;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import c2.w;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.iid.FirebaseInstanceId;
import d0.u;
import e0.v;
import f0.n0;
import f0.o0;
import fj.t;
import i2.a0;
import i2.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import nc.p2;
import rg.b0;
import rg.y;
import t.c0;
import t4.l0;
import u6.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class e implements Continuation, l.m, OnCompleteListener, u4.n, rc.g, b0, ug.d, t.q, t4.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5001a;

    public /* synthetic */ e(Object obj) {
        this.f5001a = obj;
    }

    public static x A(g7.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new z6.b(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new z6.b(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new z6.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new z6.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        z6.e eVar = new z6.e("Dependency", map, hashSet, hashSet2);
        z6.e eVarA = z6.e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new x("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new z6.b(1, "id", "TEXT", null, true, 1));
        map2.put("state", new z6.b(0, "state", "INTEGER", null, true, 1));
        map2.put("worker_class_name", new z6.b(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new z6.b(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new z6.b(0, "input", "BLOB", null, true, 1));
        map2.put("output", new z6.b(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new z6.b(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new z6.b(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new z6.b(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new z6.b(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new z6.b(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new z6.b(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new z6.b(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new z6.b(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new z6.b(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new z6.b(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new z6.b(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new z6.b(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new z6.b(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new z6.b(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new z6.b(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new z6.b(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new z6.b(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new z6.b(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new z6.b(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new z6.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new z6.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        z6.e eVar2 = new z6.e("WorkSpec", map2, hashSet3, hashSet4);
        z6.e eVarA2 = z6.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new x("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new z6.b(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new z6.b(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new z6.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        z6.e eVar3 = new z6.e("WorkTag", map3, hashSet5, hashSet6);
        z6.e eVarA3 = z6.e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new x("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new z6.b(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new z6.b(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        z6.e eVar4 = new z6.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        z6.e eVarA4 = z6.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new x("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new z6.b(1, "name", "TEXT", null, true, 1));
        map5.put("work_spec_id", new z6.b(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new z6.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        z6.e eVar5 = new z6.e("WorkName", map5, hashSet8, hashSet9);
        z6.e eVarA5 = z6.e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new x("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new z6.b(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new z6.b(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new z6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        z6.e eVar6 = new z6.e("WorkProgress", map6, hashSet10, new HashSet(0));
        z6.e eVarA6 = z6.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new x("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new z6.b(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new z6.b(0, "long_value", "INTEGER", null, false, 1));
        z6.e eVar7 = new z6.e("Preference", map7, new HashSet(0), new HashSet(0));
        z6.e eVarA7 = z6.e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new x(null, true);
        }
        return new x("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7, false);
    }

    public static n0 F(e eVar, int i10) {
        u uVar = (u) eVar.f5001a;
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            d0.o oVar = (d0.o) uVar.f4445f.getValue();
            t1.r.n(gVarF, gVarK, cVarE);
            return uVar.f4454p.a(i10, oVar.j, uVar.f4443d, new ab.d(i10, oVar));
        } catch (Throwable th2) {
            t1.r.n(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    public static void m(g7.b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public boolean B(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void C(float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f5001a).add(new i2.p(f10, f11, f12, f13));
    }

    public void D(float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f5001a).add(new i2.x(f10, f11, f12, f13));
    }

    public ArrayList E(int i10) {
        ArrayList arrayList = new ArrayList();
        v vVar = (v) this.f5001a;
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            e0.l lVar = vVar.f5328b ? vVar.f5329c : (e0.l) vVar.f5331e.getValue();
            if (lVar != null) {
                t tVar = new t();
                tVar.f6805a = 1;
                List list = (List) lVar.f5266k.invoke(Integer.valueOf(i10));
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    pi.h hVar = (pi.h) list.get(i11);
                    o0 o0Var = vVar.f5340o;
                    int iIntValue = ((Number) hVar.f13000a).intValue();
                    long j = ((s3.a) hVar.f13001b).f14736a;
                    qh.c cVar = v.f5326w;
                    tVar = tVar;
                    arrayList.add(o0Var.a(iIntValue, j, false, new e0.t((ArrayList) null, tVar, list, i10, lVar)));
                }
            }
            t1.r.n(gVarF, gVarK, cVarE);
            return arrayList;
        } catch (Throwable th2) {
            t1.r.n(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    public void G(float f10) {
        ((ArrayList) this.f5001a).add(new a0(f10));
    }

    public void H(float f10) {
        ((ArrayList) this.f5001a).add(new z(f10));
    }

    @Override // l.m
    public void a(l.h hVar, boolean z2) {
        if (hVar instanceof l.r) {
            ((l.r) hVar).f9839w.j().c(false);
        }
        l.m mVar = ((m.h) this.f5001a).f11103e;
        if (mVar != null) {
            mVar.a(hVar, z2);
        }
    }

    @Override // u4.n
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f5001a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f3789d;
        int width = (!(i10 == 0 && z2) && (i10 != 1 || z2)) ? view.getWidth() : -view.getWidth();
        Field field = l0.f15744a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // t4.c
    public t4.f build() {
        return new t4.f(new ld.i(((ContentInfo.Builder) this.f5001a).build()));
    }

    @Override // l.m
    public boolean c(l.h hVar) {
        m.h hVar2 = (m.h) this.f5001a;
        if (hVar == hVar2.f11101c) {
            return false;
        }
        ((l.r) hVar).f9840x.getClass();
        hVar2.getClass();
        l.m mVar = hVar2.f11103e;
        if (mVar != null) {
            return mVar.c(hVar);
        }
        return false;
    }

    @Override // t4.c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f5001a).setLinkUri(uri);
    }

    @Override // t4.c
    public void e(int i10) {
        ((ContentInfo.Builder) this.f5001a).setFlags(i10);
    }

    @Override // rc.g
    public void f(JsonWriter jsonWriter) throws IOException {
        Object obj = rc.h.f14340b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f5001a;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = rc.e.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // t.q
    public t.a0 get(int i10) {
        return (c0) this.f5001a;
    }

    public void h(Bundle bundle) {
        p2 p2Var = (p2) this.f5001a;
        p2Var.f12171b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            p2Var.f12173d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
    }

    @Override // ug.d
    public Object i(rg.h hVar, Object obj, Object obj2) {
        rg.o oVar = (rg.o) obj;
        rg.z zVar = (rg.z) this.f5001a;
        y yVar = zVar.f14495f;
        if (!hVar.isEmpty() && oVar.g()) {
            wg.h hVar2 = oVar.d().f19307a;
            wg.h hVarI = rg.z.i(hVar2);
            zVar.k(hVar2);
            yVar.r(hVarI);
            return null;
        }
        ArrayList arrayListE = oVar.e();
        int size = arrayListE.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayListE.get(i10);
            i10++;
            wg.h hVar3 = ((wg.i) obj3).f19307a;
            wg.h hVarI2 = rg.z.i(hVar3);
            zVar.k(hVar3);
            yVar.r(hVarI2);
        }
        return null;
    }

    @Override // rg.b0
    public void j(String str) {
        rg.k kVar = (rg.k) this.f5001a;
        kVar.f14439i.l(null, "Auth token changed, triggering auth token refresh", new Object[0]);
        pg.q qVar = kVar.f14433c;
        qVar.f12948y.l(null, "Auth token refreshed.", new Object[0]);
        qVar.f12940q = str;
        if (qVar.a()) {
            if (str != null) {
                qVar.j(false);
                return;
            }
            hj.a.z(qVar.a(), "Must be connected to send unauth.", new Object[0]);
            hj.a.z(qVar.f12940q == null, "Auth token must not be set.", new Object[0]);
            qVar.n("unauth", false, Collections.EMPTY_MAP, null);
        }
    }

    public void k() {
        ((ArrayList) this.f5001a).add(i2.j.f8278c);
    }

    public u4.e l(int i10) {
        return null;
    }

    public void n(float f10, float f11, float f12, float f13, float f14, float f15) {
        ((ArrayList) this.f5001a).add(new i2.k(f10, f11, f12, f13, f14, f15));
    }

    public void o(float f10, float f11, float f12, float f13, float f14, float f15) {
        ((ArrayList) this.f5001a).add(new i2.s(f10, f11, f12, f13, f14, f15));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f5001a;
        mh.g gVar = FirebaseInstanceId.j;
        countDownLatch.countDown();
    }

    public long p() {
        int i10 = w.f3059i;
        long j = ((Parcel) this.f5001a).readLong();
        long j4 = 63 & j;
        return j4 < 16 ? j : (j & (-64)) | (j4 + 1);
    }

    public long q() {
        Parcel parcel = (Parcel) this.f5001a;
        byte b10 = parcel.readByte();
        long j = b10 == 1 ? 4294967296L : b10 == 2 ? 8589934592L : 0L;
        return s3.p.a(j, 0L) ? s3.o.f14757c : hj.a.D(j, parcel.readFloat());
    }

    public u4.e r(int i10) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:9:0x0023, B:11:0x0034, B:15:0x0042, B:18:0x0052, B:20:0x0059, B:22:0x0069, B:28:0x007f, B:33:0x008a, B:35:0x0092, B:36:0x0094, B:47:0x00c5, B:50:0x00c8, B:51:0x00c9, B:26:0x0079, B:37:0x0095, B:39:0x00a3, B:44:0x00b8), top: B:146:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q8.b s(r8.g r20, q8.a r21, s8.h r22, s8.g r23) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.s(r8.g, q8.a, s8.h, s8.g):q8.b");
    }

    @Override // t4.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f5001a).setExtras(bundle);
    }

    public void t(float f10) {
        ((ArrayList) this.f5001a).add(new i2.l(f10));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f5001a);
        }
        Exception exception = task.getException();
        e0.i(exception);
        if (!(exception instanceof jg.n)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }

    public void u(float f10) {
        ((ArrayList) this.f5001a).add(new i2.t(f10));
    }

    public void v(float f10, float f11) {
        ((ArrayList) this.f5001a).add(new i2.m(f10, f11));
    }

    public void w(float f10, float f11) {
        ((ArrayList) this.f5001a).add(new i2.u(f10, f11));
    }

    public void x(float f10, float f11) {
        ((ArrayList) this.f5001a).add(new i2.n(f10, f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q8.a y(r8.g r9, java.lang.Object r10, r8.n r11, h8.f r12) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.y(r8.g, java.lang.Object, r8.n, h8.f):q8.a");
    }

    public int z(int i10) {
        WorkDatabase workDatabase;
        int i11;
        synchronized (e.class) {
            try {
                workDatabase = (WorkDatabase) this.f5001a;
                workDatabase.c();
                Long lN = workDatabase.s().n("next_job_scheduler_id");
                i11 = 0;
                int iIntValue = lN != null ? lN.intValue() : 0;
                workDatabase.s().u(new c8.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.q();
                workDatabase.h();
                if (iIntValue < 0 || iIntValue > i10) {
                    ((WorkDatabase) this.f5001a).s().u(new c8.c("next_job_scheduler_id", 1));
                } else {
                    i11 = iIntValue;
                }
            } catch (Throwable th2) {
                workDatabase.h();
                throw th2;
            } finally {
            }
        }
        return i11;
    }

    public e(int i10) {
        switch (i10) {
            case 6:
                this.f5001a = new g1.e(new f0.m[16]);
                break;
            case 7:
                p2 p2Var = new p2();
                this.f5001a = p2Var;
                p2Var.f12173d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 9:
                this.f5001a = new ArrayList(32);
                break;
            case 11:
                this.f5001a = Build.VERSION.SDK_INT >= 28 ? new y9.a() : new ef.f();
                break;
            case 14:
                this.f5001a = new AtomicInteger(0);
                break;
            case 16:
                this.f5001a = new Handler(Looper.getMainLooper());
                break;
            case 27:
                this.f5001a = new u4.f(this);
                break;
            default:
                this.f5001a = new HashMap();
                break;
        }
    }

    public e(ClipData clipData, int i10) {
        this.f5001a = l4.e.n(clipData, i10);
    }

    public void g(int i10, u4.e eVar, String str, Bundle bundle) {
    }
}
