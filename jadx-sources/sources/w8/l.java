package w8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlu;
import nb.x;
import tj.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final p7.k f18969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f18970b;

    public /* synthetic */ l(a aVar, p7.k kVar) {
        this.f18970b = aVar;
        this.f18969a = kVar;
    }

    public final void a(c cVar) {
        synchronized (this.f18970b.f18916a) {
            try {
                if (this.f18970b.f18917b == 3) {
                    return;
                }
                this.f18969a.j(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z2;
        zze.zzl("BillingClient", "Billing service died.");
        try {
            a aVar = this.f18970b;
            synchronized (aVar.f18916a) {
                z2 = true;
                if (aVar.f18917b != 1) {
                    z2 = false;
                }
            }
            if (z2) {
                qh.c cVar = this.f18970b.f18922g;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(122);
                zzjxVarZzc.zza(zzkeVarZzc);
                cVar.Q((zzjz) zzjxVarZzc.zzf());
            } else {
                qh.c cVar2 = this.f18970b.f18922g;
                zzkl zzklVarZzB = zzkl.zzB();
                cVar2.getClass();
                try {
                    zzli zzliVarZzc = zzlk.zzc();
                    zzliVarZzc.zzo((zzku) cVar2.f13507b);
                    zzliVarZzc.zzn(zzklVarZzB);
                    ((g6.b) cVar2.f13508c).c((zzlk) zzliVarZzc.zzf());
                } catch (Throwable th2) {
                    zze.zzm("BillingLogger", "Unable to log.", th2);
                }
            }
        } catch (Throwable th3) {
            zze.zzm("BillingClient", "Unable to log.", th3);
        }
        synchronized (this.f18970b.f18916a) {
            if (this.f18970b.f18917b != 3 && this.f18970b.f18917b != 0) {
                this.f18970b.n(0);
                this.f18970b.o();
                r0 r0Var = nb.o.f12042r;
                x xVar = x.f12086a;
                r0Var.getClass();
                r0Var.k(null, xVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized (this.f18970b.f18916a) {
            try {
                if (this.f18970b.f18917b == 3) {
                    return;
                }
                this.f18970b.f18923h = zzam.zzu(iBinder);
                a aVar = this.f18970b;
                if (a.g(new h6.c(this, 5), 30000L, new t7.s(this, 5), Looper.myLooper() == null ? aVar.f18919d : new Handler(Looper.myLooper()), aVar.k()) == null) {
                    a aVar2 = this.f18970b;
                    c cVarH = aVar2.h();
                    aVar2.s(25, 6, cVarH);
                    a(cVarH);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z2;
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.f18970b;
            synchronized (aVar.f18916a) {
                z2 = true;
                if (aVar.f18917b != 1) {
                    z2 = false;
                }
            }
            if (z2) {
                qh.c cVar = this.f18970b.f18922g;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(121);
                zzjxVarZzc.zza(zzkeVarZzc);
                cVar.Q((zzjz) zzjxVarZzc.zzf());
            } else {
                qh.c cVar2 = this.f18970b.f18922g;
                zzlu zzluVarZzB = zzlu.zzB();
                cVar2.getClass();
                if (zzluVarZzB != null) {
                    try {
                        zzli zzliVarZzc = zzlk.zzc();
                        zzliVarZzc.zzo((zzku) cVar2.f13507b);
                        zzliVarZzc.zzq(zzluVarZzB);
                        ((g6.b) cVar2.f13508c).c((zzlk) zzliVarZzc.zzf());
                    } catch (Throwable th2) {
                        zze.zzm("BillingLogger", "Unable to log.", th2);
                    }
                }
            }
        } catch (Throwable th3) {
            zze.zzm("BillingClient", "Unable to log.", th3);
        }
        synchronized (this.f18970b.f18916a) {
            try {
                if (this.f18970b.f18917b == 3) {
                    return;
                }
                this.f18970b.n(0);
                r0 r0Var = nb.o.f12042r;
                x xVar = x.f12086a;
                r0Var.getClass();
                r0Var.k(null, xVar);
            } finally {
            }
        }
    }
}
