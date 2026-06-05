package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c8.i;
import java.util.ArrayList;
import java.util.HashMap;
import t.m1;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements u7.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f18892d = m.l("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f18893a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18894b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f18895c = new Object();

    public b(Context context) {
        this.f18893a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        synchronized (this.f18895c) {
            try {
                u7.a aVar = (u7.a) this.f18894b.remove(str);
                if (aVar != null) {
                    aVar.b(str, z2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Intent intent, int i10, g gVar) {
        boolean z2;
        String action = intent.getAction();
        int i11 = 4;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.g().c(f18892d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f18893a;
            d dVar = new d(context, i10, gVar);
            y7.c cVar = dVar.f18899b;
            ArrayList arrayListD = gVar.f18913e.f16842d.w().d();
            String str = c.f18896a;
            int size = arrayListD.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListD.get(i12);
                i12++;
                t7.c cVar2 = ((i) obj).j;
                z10 |= cVar2.f16105d;
                z11 |= cVar2.f16103b;
                z12 |= cVar2.f16106e;
                z13 |= cVar2.f16102a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1244a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            cVar.b(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListD.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayListD.get(i13);
                i13++;
                i iVar = (i) obj2;
                String str3 = iVar.f3121a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList.get(i14);
                i14++;
                String str4 = ((i) obj3).f3121a;
                Intent intentA = a(context, str4);
                m.g().c(d.f18897c, m1.j("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new b8.e(gVar, dVar.f18898a, i11, intentA));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.g().c(f18892d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            gVar.f18913e.s0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m.g().f(f18892d, m1.j("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f18893a;
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            m mVarG = m.g();
            String str5 = f18892d;
            mVarG.c(str5, m1.i("Handling schedule work for ", string), new Throwable[0]);
            k kVar = gVar.f18913e;
            WorkDatabase workDatabase = kVar.f16842d;
            workDatabase.c();
            try {
                i iVarH = workDatabase.w().h(string);
                if (iVarH == null) {
                    m.g().m(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    return;
                }
                if (m1.b(iVarH.f3122b)) {
                    m.g().m(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    return;
                }
                long jA = iVarH.a();
                if (iVarH.b()) {
                    m.g().c(str5, "Opportunistically setting an alarm for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, kVar, string, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new b8.e(gVar, i10, 4, intent3));
                } else {
                    m.g().c(str5, "Setting up Alarms for " + string + " at " + jA, new Throwable[0]);
                    a.b(context2, kVar, string, jA);
                }
                workDatabase.q();
                return;
            } finally {
                workDatabase.h();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f18895c) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    m mVarG2 = m.g();
                    String str6 = f18892d;
                    mVarG2.c(str6, "Handing delay met for " + string2, new Throwable[0]);
                    if (this.f18894b.containsKey(string2)) {
                        m.g().c(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    } else {
                        e eVar = new e(this.f18893a, i10, string2, gVar);
                        this.f18894b.put(string2, eVar);
                        eVar.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                m.g().m(f18892d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            m.g().c(f18892d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            b(string3, z14);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m.g().c(f18892d, m1.i("Handing stopWork work for ", string4), new Throwable[0]);
        gVar.f18913e.u0(string4);
        Context context3 = this.f18893a;
        k kVar2 = gVar.f18913e;
        String str7 = a.f18891a;
        ac.d dVarT = kVar2.f16842d.t();
        c8.d dVarZ = dVarT.z(string4);
        if (dVarZ != null) {
            a.a(context3, string4, dVarZ.f3114b);
            z2 = false;
            m.g().c(a.f18891a, m1.j("Removing SystemIdInfo for workSpecId (", string4, ")"), new Throwable[0]);
            dVarT.J(string4);
        } else {
            z2 = false;
        }
        gVar.b(string4, z2);
    }
}
