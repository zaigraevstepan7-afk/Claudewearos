package w8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzv;
import f0.a1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends a {
    public volatile int A;
    public volatile zzav B;
    public volatile kf.d C;
    public volatile zzew D;

    /* renamed from: z, reason: collision with root package name */
    public final Context f18976z;

    public q(y9.a aVar, Context context) {
        super(aVar, context);
        this.A = 0;
        this.f18976z = context;
    }

    public final void A(int i10, Consumer consumer, Runnable runnable) {
        zzew zzewVar;
        zzev zzevVar;
        zzeu zzeuVarY = y(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
                }
                zzewVar = this.D;
            } finally {
            }
        }
        zzeu zzeuVarZzb = zzel.zzb(zzeuVarY, 28500L, timeUnit, zzewVar);
        md.m mVar = new md.m();
        mVar.f11638a = i10;
        mVar.f11639b = consumer;
        mVar.f11640c = runnable;
        mVar.f11641d = this;
        synchronized (this) {
            try {
                if (this.f18938x == null) {
                    this.f18938x = zzfb.zza(k());
                }
                zzevVar = this.f18938x;
            } finally {
            }
        }
        zzel.zzc(zzeuVarZzb, mVar, zzevVar);
    }

    @Override // w8.a
    public final void a(rc.f fVar, l7.n nVar) {
        A(3, new o(nVar), new b8.b(this, fVar, nVar, 14, false));
    }

    @Override // w8.a
    public final void b() {
        synchronized (this) {
            zzkd zzkdVarD = s.d(27);
            Objects.requireNonNull(zzkdVarD, "ApiSuccess should not be null");
            this.f18922g.R(zzkdVarD);
            try {
                try {
                    if (this.C != null && this.B != null) {
                        zze.zzk("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f18976z.unbindService(this.C);
                        this.C = new kf.d(this, 1);
                    }
                    this.B = null;
                    if (this.D != null) {
                        this.D.shutdownNow();
                        this.D = null;
                    }
                } catch (RuntimeException e10) {
                    zze.zzm("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
                }
                this.A = 3;
            } catch (Throwable th2) {
                this.A = 3;
                throw th2;
            }
        }
        super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final c d(Activity activity, a1 a1Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) y(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            z(114, 28, u.f18994r);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            z(107, 28, u.f18994r);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            c cVarA = u.a(iIntValue, "Billing override value was set by a license tester.");
            z(105, 2, cVarA);
            u(cVarA);
            return cVarA;
        }
        try {
            return super.d(activity, a1Var);
        } catch (Exception e12) {
            c cVar = u.f18985h;
            z(115, 2, cVar);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e12);
            return cVar;
        }
    }

    @Override // w8.a
    public final void e(a0 a0Var, final ac.l lVar) {
        A(7, new Consumer() { // from class: w8.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                lVar.d((c) obj, arrayList);
            }
        }, new b8.b(this, a0Var, lVar, 13, false));
    }

    @Override // w8.a
    public final void f(p7.k kVar) {
        synchronized (this) {
            if (x()) {
                zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                zzkd zzkdVarD = s.d(26);
                Objects.requireNonNull(zzkdVarD, "ApiSuccess should not be null");
                this.f18922g.R(zzkdVarD);
            } else {
                int i10 = 1;
                if (this.A == 1) {
                    zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.A == 3) {
                    zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    z(38, 26, u.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.A = 1;
                    zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.C = new kf.d(this, 1);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> listQueryIntentServices = this.f18976z.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f18976z.bindService(intent2, this.C, 1)) {
                                    zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i10 = 39;
                        }
                    }
                    this.A = 0;
                    zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
                    z(i10, 26, u.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.f(kVar);
    }

    public final /* synthetic */ void v(rc.f fVar, l7.n nVar) {
        super.a(fVar, nVar);
    }

    public final /* synthetic */ void w(a0 a0Var, ac.l lVar) {
        super.e(a0Var, lVar);
    }

    public final synchronized boolean x() {
        if (this.A == 2 && this.B != null) {
            if (this.C != null) {
                return true;
            }
        }
        return false;
    }

    public final zzeu y(int i10) {
        if (x()) {
            return zzv.zza(new n(this, i10));
        }
        zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        z(106, 28, u.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    public final void z(int i10, int i11, c cVar) {
        zzjz zzjzVarB = s.b(i10, i11, cVar);
        Objects.requireNonNull(zzjzVarB, "ApiFailure should not be null");
        this.f18922g.Q(zzjzVarB);
    }

    public q(y9.a aVar, Context context, ac.h hVar) {
        super(aVar, context, hVar);
        this.A = 0;
        this.f18976z = context;
    }
}
