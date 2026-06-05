package w7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18891a = m.l("Alarms");

    public static void a(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.g().c(f18891a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i10 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = kVar.f16842d;
        ac.d dVarT = workDatabase.t();
        c8.d dVarZ = dVarT.z(str);
        if (dVarZ != null) {
            a(context, str, dVarZ.f3114b);
            int i10 = dVarZ.f3114b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (d8.e.class) {
            workDatabase.c();
            try {
                Long lN = workDatabase.s().n("next_alarm_manager_id");
                iIntValue = lN != null ? lN.intValue() : 0;
                workDatabase.s().u(new c8.c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.q();
                workDatabase.h();
            } catch (Throwable th2) {
                workDatabase.h();
                throw th2;
            }
        }
        dVarT.C(new c8.d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
