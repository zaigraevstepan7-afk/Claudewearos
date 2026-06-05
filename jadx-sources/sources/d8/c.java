package d8;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4993c = t7.m.l("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final u7.e f4994a;

    /* renamed from: b, reason: collision with root package name */
    public final q5.b f4995b = new q5.b(11);

    public c(u7.e eVar) {
        this.f4994a = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(u7.e r20) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.c.a(u7.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        q5.b bVar = this.f4995b;
        u7.e eVar = this.f4994a;
        u7.k kVar = eVar.f16820b;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f16822d);
            HashSet hashSetU = u7.e.U(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f16822d);
                    z2 = false;
                    break;
                } else if (hashSetU.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = kVar.f16842d;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.q();
                if (zA) {
                    f.a(kVar.f16840b, RescheduleReceiver.class, true);
                    u7.d.a(kVar.f16841c, kVar.f16842d, kVar.f16844f);
                }
                bVar.w(t7.r.f16128r);
            } finally {
                workDatabase.h();
            }
        } catch (Throwable th2) {
            bVar.w(new t7.o(th2));
        }
    }
}
