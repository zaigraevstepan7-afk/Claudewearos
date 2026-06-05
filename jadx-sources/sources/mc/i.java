package mc;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzfnz;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpt;
import com.google.android.gms.internal.ads.zzgdb;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import nc.s;
import nc.t;
import qc.l0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements Runnable, zzavn {
    public static final long I = System.currentTimeMillis();
    public final zzfnz A;
    public Context B;
    public final Context C;
    public rc.a D;
    public final rc.a E;
    public final boolean F;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11556d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11557e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11558f;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f11559z;

    /* renamed from: a, reason: collision with root package name */
    public final Vector f11553a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11554b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f11555c = new AtomicReference();
    public final CountDownLatch G = new CountDownLatch(1);

    public i(Context context, rc.a aVar) {
        this.B = context;
        this.C = context;
        this.D = aVar;
        this.E = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f11559z = executorServiceNewCachedThreadPool;
        zzbct zzbctVar = zzbdc.zzcF;
        t tVar = t.f12227d;
        boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue();
        this.F = zBooleanValue;
        this.A = zzfnz.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        zzbct zzbctVar2 = zzbdc.zzcC;
        zzbda zzbdaVar = tVar.f12230c;
        this.f11557e = ((Boolean) zzbdaVar.zzb(zzbctVar2)).booleanValue();
        this.f11558f = ((Boolean) zzbdaVar.zzb(zzbdc.zzcG)).booleanValue();
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzcE)).booleanValue()) {
            this.H = 2;
        } else {
            this.H = 1;
        }
        if (!((Boolean) zzbdaVar.zzb(zzbdc.zzdI)).booleanValue()) {
            this.f11556d = b();
        }
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzdC)).booleanValue()) {
            zzcad.zza.execute(this);
            return;
        }
        rc.e eVar = s.f12202f.f12203a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzcad.zza.execute(this);
        } else {
            run();
        }
    }

    public final String a(Context context) {
        zzavn zzavnVarD;
        if (!c() || (zzavnVarD = d()) == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzavnVarD.zzf(context);
    }

    public final boolean b() {
        Context context = this.B;
        p7.k kVar = new p7.k(this, 15);
        return new zzfpt(context, zzfoz.zzb(context, this.A), kVar, ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcD)).booleanValue()).zzd(1);
    }

    public final boolean c() throws InterruptedException {
        try {
            this.G.await();
            return true;
        } catch (InterruptedException e10) {
            int i10 = l0.f13401b;
            rc.k.h("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final zzavn d() {
        return ((!this.f11557e || this.f11556d) ? this.H : 1) == 2 ? (zzavn) this.f11555c.get() : (zzavn) this.f11554b.get();
    }

    public final void e() {
        zzavn zzavnVarD = d();
        Vector vector = this.f11553a;
        if (vector.isEmpty() || zzavnVarD == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                zzavnVarD.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzavnVarD.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void f(boolean z2) {
        String str = this.D.f14321a;
        Context context = this.B;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzart zzartVarZza = zzarv.zza();
        zzartVarZza.zza(z2);
        zzartVarZza.zzb(str);
        this.f11554b.set(zzavr.zzt(context, new zzavp((zzarv) zzartVarZza.zzbr())));
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.G;
        try {
            zzbct zzbctVar = zzbdc.zzdI;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                this.f11556d = b();
            }
            boolean z2 = this.D.f14324d;
            boolean z10 = false;
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzbh)).booleanValue() && z2) {
                z10 = true;
            }
            if (((!this.f11557e || this.f11556d) ? this.H : 1) == 1) {
                f(z10);
                if (this.H == 2) {
                    this.f11559z.execute(new h(this, z10, 0));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = this.B;
                    rc.a aVar = this.D;
                    boolean z11 = this.F;
                    zzart zzartVarZza = zzarv.zza();
                    zzartVarZza.zza(z10);
                    zzartVarZza.zzb(aVar.f14321a);
                    zzarv zzarvVar = (zzarv) zzartVarZza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzavk zzavkVarZza = zzavk.zza(context, zzarvVar, z11);
                    this.f11555c.set(zzavkVarZza);
                    if (this.f11558f && !zzavkVarZza.zzr()) {
                        this.H = 1;
                        f(z10);
                    }
                } catch (NullPointerException e10) {
                    this.H = 1;
                    f(z10);
                    this.A.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            countDownLatch.countDown();
            this.B = null;
            this.D = null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            this.B = null;
            this.D = null;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!c()) {
            return "";
        }
        zzavn zzavnVarD = d();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkT)).booleanValue()) {
            r0 r0Var = n.D.f11577c;
            r0.i(view, 4);
        }
        if (zzavnVarD == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzavnVarD.zze(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzf(Context context) {
        return a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzg(Context context) {
        try {
            return (String) zzgdb.zzj(new g(0, this, context), this.f11559z).get(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzcW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzavg.zza(context, this.E.f14321a, I, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzh(Context context, View view, Activity activity) {
        zzbct zzbctVar = zzbdc.zzkS;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (!((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            zzavn zzavnVarD = d();
            if (((Boolean) zzbdaVar2.zzb(zzbdc.zzkT)).booleanValue()) {
                r0 r0Var = n.D.f11577c;
                r0.i(view, 2);
            }
            return zzavnVarD != null ? zzavnVarD.zzh(context, view, activity) : "";
        }
        if (!c()) {
            return "";
        }
        zzavn zzavnVarD2 = d();
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzkT)).booleanValue()) {
            r0 r0Var2 = n.D.f11577c;
            r0.i(view, 2);
        }
        return zzavnVarD2 != null ? zzavnVarD2.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzk(MotionEvent motionEvent) {
        zzavn zzavnVarD = d();
        if (zzavnVarD == null) {
            this.f11553a.add(new Object[]{motionEvent});
        } else {
            e();
            zzavnVarD.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzl(int i10, int i11, int i12) {
        zzavn zzavnVarD = d();
        if (zzavnVarD != null) {
            e();
            zzavnVarD.zzl(i10, i11, i12);
        } else {
            this.f11553a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavn zzavnVarD;
        zzavn zzavnVarD2;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdc)).booleanValue()) {
            if (this.G.getCount() != 0 || (zzavnVarD2 = d()) == null) {
                return;
            }
            zzavnVarD2.zzn(stackTraceElementArr);
            return;
        }
        if (!c() || (zzavnVarD = d()) == null) {
            return;
        }
        zzavnVarD.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzo(View view) {
        zzavn zzavnVarD = d();
        if (zzavnVarD != null) {
            zzavnVarD.zzo(view);
        }
    }
}
