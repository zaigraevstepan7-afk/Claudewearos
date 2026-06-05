package w7;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c8.i;
import d8.j;
import d8.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t.m1;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements y7.b, u7.a, q {
    public static final String C = m.l("DelayMetCommandHandler");
    public PowerManager.WakeLock A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18902c;

    /* renamed from: d, reason: collision with root package name */
    public final g f18903d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.c f18904e;
    public boolean B = false;

    /* renamed from: z, reason: collision with root package name */
    public int f18906z = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18905f = new Object();

    public e(Context context, int i10, String str, g gVar) {
        this.f18900a = context;
        this.f18901b = i10;
        this.f18903d = gVar;
        this.f18902c = str;
        this.f18904e = new y7.c(context, gVar.f18910b, this);
    }

    public final void a() {
        synchronized (this.f18905f) {
            try {
                this.f18904e.c();
                this.f18903d.f18911c.b(this.f18902c);
                PowerManager.WakeLock wakeLock = this.A;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.g().c(C, "Releasing wakelock " + this.A + " for WorkSpec " + this.f18902c, new Throwable[0]);
                    this.A.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        m.g().c(C, "onExecuted " + str + ", " + z2, new Throwable[0]);
        a();
        int i10 = this.f18901b;
        g gVar = this.f18903d;
        Context context = this.f18900a;
        if (z2) {
            gVar.e(new b8.e(gVar, i10, 4, b.c(context, this.f18902c)));
        }
        if (this.B) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new b8.e(gVar, i10, 4, intent));
        }
    }

    public final void c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f18902c;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(this.f18901b);
        sb2.append(")");
        this.A = j.a(this.f18900a, sb2.toString());
        m mVarG = m.g();
        PowerManager.WakeLock wakeLock = this.A;
        String str2 = C;
        mVarG.c(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.A.acquire();
        i iVarH = this.f18903d.f18913e.f16842d.w().h(str);
        if (iVarH == null) {
            d();
            return;
        }
        boolean zB = iVarH.b();
        this.B = zB;
        if (zB) {
            this.f18904e.b(Collections.singletonList(iVarH));
        } else {
            m.g().c(str2, m1.i("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    public final void d() {
        synchronized (this.f18905f) {
            try {
                if (this.f18906z < 2) {
                    this.f18906z = 2;
                    m mVarG = m.g();
                    String str = C;
                    mVarG.c(str, "Stopping work for WorkSpec " + this.f18902c, new Throwable[0]);
                    Context context = this.f18900a;
                    String str2 = this.f18902c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f18903d;
                    gVar.e(new b8.e(gVar, this.f18901b, 4, intent));
                    if (this.f18903d.f18912d.d(this.f18902c)) {
                        m.g().c(str, "WorkSpec " + this.f18902c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentC = b.c(this.f18900a, this.f18902c);
                        g gVar2 = this.f18903d;
                        gVar2.e(new b8.e(gVar2, this.f18901b, 4, intentC));
                    } else {
                        m.g().c(str, "Processor does not have WorkSpec " + this.f18902c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    m.g().c(C, "Already stopped work for " + this.f18902c, new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y7.b
    public final void e(ArrayList arrayList) {
        d();
    }

    @Override // y7.b
    public final void f(List list) {
        if (list.contains(this.f18902c)) {
            synchronized (this.f18905f) {
                try {
                    if (this.f18906z == 0) {
                        this.f18906z = 1;
                        m.g().c(C, "onAllConstraintsMet for " + this.f18902c, new Throwable[0]);
                        if (this.f18903d.f18912d.g(this.f18902c, null)) {
                            this.f18903d.f18911c.a(this.f18902c, this);
                        } else {
                            a();
                        }
                    } else {
                        m.g().c(C, "Already started work for " + this.f18902c, new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
