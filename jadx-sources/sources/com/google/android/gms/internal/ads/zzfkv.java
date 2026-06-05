package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.n;
import nc.h2;
import nc.i2;
import nc.j3;
import nc.s0;
import nc.t;
import nc.t0;
import nc.u0;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfkv {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpo zzd;
    protected j3 zze;
    protected AtomicBoolean zzf;
    protected u0 zzg;
    private s0 zzh;
    private final Queue zzi;
    private final zzfjy zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    private zzfkd zzp;
    private final ud.a zzq;
    private final zzfkl zzr;

    public zzfkv(ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        this("none", clientApi, context, i10, zzbpoVar, j3Var, scheduledExecutorService, zzfjyVar, aVar);
        this.zzh = s0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzD() {
        return true != "none".equals(this.zzk) ? "2" : "1";
    }

    private final synchronized void zzE(Object obj) {
        try {
            ud.a aVar = this.zzq;
            zzfkm zzfkmVar = new zzfkm(obj, aVar);
            this.zzi.add(zzfkmVar);
            i2 i2VarZza = zza(obj);
            ((ud.b) aVar).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.zzn.get()) {
                r0.f13445l.post(new zzfkq(this, i2VarZza));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzm;
            scheduledExecutorService.execute(new zzfkr(this, jCurrentTimeMillis, i2VarZza));
            scheduledExecutorService.schedule(new zzfkp(this), zzfkmVar.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzF(Throwable th2) {
        try {
            this.zzl.set(false);
            if ((th2 instanceof zzfjs) && ((zzfjs) th2).zza() == 0) {
                throw null;
            }
            zzN(true);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzG(Object obj) {
        try {
            this.zzl.set(false);
            if (obj != null) {
                this.zzj.zzc();
                this.zzo.set(true);
                zzE(obj);
            }
            zzN(obj == null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzH(nc.i2 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            nc.s0 r0 = r4.zzh     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == 0) goto L1e
            nc.j3 r2 = r4.zze     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            nc.r0 r0 = (nc.r0) r0     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            android.os.Parcel r3 = r0.zza()     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            com.google.android.gms.internal.ads.zzayt.zzd(r3, r2)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            r0.zzdb(r1, r3)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            goto L1e
        L15:
            r5 = move-exception
            goto L40
        L17:
            int r0 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "Failed to call onAdsAvailable"
            rc.k.g(r0)     // Catch: java.lang.Throwable -> L15
        L1e:
            nc.u0 r0 = r4.zzg     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L3e
            java.lang.String r2 = r4.zzk     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            nc.t0 r0 = (nc.t0) r0     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            android.os.Parcel r3 = r0.zza()     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            r3.writeString(r2)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzayt.zzf(r3, r5)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            r0.zzdb(r1, r3)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L35
            monitor-exit(r4)
            return
        L35:
            int r5 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = "Failed to call onAdPreloaded"
            rc.k.g(r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return
        L3e:
            monitor-exit(r4)
            return
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkv.zzH(nc.i2):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzI() {
        /*
            r4 = this;
            monitor-enter(r4)
            nc.s0 r0 = r4.zzh     // Catch: java.lang.Throwable -> L15
            r1 = 2
            if (r0 == 0) goto L1e
            nc.j3 r2 = r4.zze     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            nc.r0 r0 = (nc.r0) r0     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            android.os.Parcel r3 = r0.zza()     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            com.google.android.gms.internal.ads.zzayt.zzd(r3, r2)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            r0.zzdb(r1, r3)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L17
            goto L1e
        L15:
            r0 = move-exception
            goto L3d
        L17:
            int r0 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "Failed to call onAdsExhausted"
            rc.k.g(r0)     // Catch: java.lang.Throwable -> L15
        L1e:
            nc.u0 r0 = r4.zzg     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L3b
            java.lang.String r2 = r4.zzk     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L32
            nc.t0 r0 = (nc.t0) r0     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L32
            android.os.Parcel r3 = r0.zza()     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L32
            r3.writeString(r2)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L32
            r0.zzdb(r1, r3)     // Catch: java.lang.Throwable -> L15 android.os.RemoteException -> L32
            monitor-exit(r4)
            return
        L32:
            int r0 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "Failed to call onAdsExhausted"
            rc.k.g(r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return
        L3b:
            monitor-exit(r4)
            return
        L3d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkv.zzI():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzJ(h2 h2Var) {
        u0 u0Var = this.zzg;
        if (u0Var != null) {
            try {
                String str = this.zzk;
                t0 t0Var = (t0) u0Var;
                Parcel parcelZza = t0Var.zza();
                parcelZza.writeString(str);
                zzayt.zzd(parcelZza, h2Var);
                t0Var.zzdb(3, parcelZza);
            } catch (RemoteException unused) {
                int i10 = l0.f13401b;
                k.g("Failed to call onAdFailedToPreload");
            }
        }
    }

    private final synchronized void zzK() {
        try {
            if (this.zzo.get() && this.zzi.isEmpty()) {
                this.zzo.set(false);
                if (this.zzn.get()) {
                    r0.f13445l.post(new zzfkt(this));
                }
                this.zzm.execute(new zzfku(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzL(h2 h2Var) {
        try {
            if (this.zzn.get()) {
                r0.f13445l.post(new zzfks(this, h2Var));
            }
            this.zzl.set(false);
            int i10 = h2Var.f12114a;
            if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
                zzN(true);
                return;
            }
            j3 j3Var = this.zze;
            String str = "Preloading " + j3Var.f12130b + ", for adUnitId:" + j3Var.f12129a + ", Ad load failed. Stop preloading due to non-retriable error:";
            int i11 = l0.f13401b;
            k.f(str);
            this.zzf.set(false);
            zzfkj zzfkjVar = new zzfkj(this.zze.f12129a, zze());
            zzfkjVar.zzb(this.zzk);
            zzfkl zzfklVar = new zzfkl(zzfkjVar, null);
            zzfkd zzfkdVar = this.zzp;
            ((ud.b) this.zzq).getClass();
            zzfkdVar.zzk(System.currentTimeMillis(), zzfklVar, h2Var, this.zze.f12132d, zzd(), zzD());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzM() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfkm) it.next()).zzd()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzN(boolean z2) {
        try {
            zzfjy zzfjyVar = this.zzj;
            if (zzfjyVar.zze()) {
                return;
            }
            if (z2) {
                zzfjyVar.zzb();
            }
            this.zzm.schedule(new zzfkp(this), zzfjyVar.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzO(i2 i2Var) {
        if (i2Var instanceof zzcvk) {
            return ((zzcvk) i2Var).zzl();
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ double zzc(zzfkv zzfkvVar, i2 i2Var) {
        if (i2Var instanceof zzcvk) {
            return ((zzcvk) i2Var).zzc();
        }
        return 0.0d;
    }

    public final void zzA() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    public final void zzB(int i10) {
        e0.b(i10 > 0);
        fc.b bVarA = fc.b.a(this.zze.f12130b);
        int i11 = this.zze.f12132d;
        synchronized (this) {
            try {
                j3 j3Var = this.zze;
                this.zze = new j3(j3Var.f12129a, j3Var.f12130b, j3Var.f12131c, i10 > 0 ? i10 : j3Var.f12132d);
                Queue queue = this.zzi;
                if (queue.size() > i10) {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzu)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < i10; i12++) {
                            zzfkm zzfkmVar = (zzfkm) queue.poll();
                            if (zzfkmVar != null) {
                                arrayList.add(zzfkmVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzfkd zzfkdVar = this.zzp;
        if (zzfkdVar == null || bVarA == null) {
            return;
        }
        ((ud.b) this.zzq).getClass();
        zzfkdVar.zza(i11, i10, System.currentTimeMillis(), new zzfkl(new zzfkj(this.zze.f12129a, bVarA), null));
    }

    public final synchronized boolean zzC() {
        zzM();
        return !this.zzi.isEmpty();
    }

    public abstract i2 zza(Object obj);

    public abstract mf.a zzb(Context context);

    public final synchronized int zzd() {
        return this.zzi.size();
    }

    public final fc.b zze() {
        return fc.b.a(this.zze.f12130b);
    }

    public final synchronized zzfkv zzh() {
        this.zzm.submit(new zzfkp(this));
        return this;
    }

    public final synchronized Object zzj() {
        zzfkm zzfkmVar = (zzfkm) this.zzi.peek();
        if (zzfkmVar == null) {
            return null;
        }
        return zzfkmVar.zzc();
    }

    public final synchronized Object zzk() {
        try {
            this.zzj.zzc();
            Queue queue = this.zzi;
            zzfkm zzfkmVar = (zzfkm) queue.poll();
            this.zzo.set(zzfkmVar != null);
            if (zzfkmVar == null) {
                zzfkmVar = null;
            } else if (!queue.isEmpty()) {
                zzfkm zzfkmVar2 = (zzfkm) queue.peek();
                fc.b bVarA = fc.b.a(this.zze.f12130b);
                String strZzO = zzO(zza(zzfkmVar.zzc()));
                if (zzfkmVar2 != null && bVarA != null && strZzO != null && zzfkmVar2.zzb() < zzfkmVar.zzb()) {
                    zzfkd zzfkdVar = this.zzp;
                    ((ud.b) this.zzq).getClass();
                    zzfkdVar.zzn(System.currentTimeMillis(), this.zze.f12132d, zzd(), strZzO, this.zzr, zzD());
                }
            }
            zzw();
            if (zzfkmVar == null) {
                return null;
            }
            return zzfkmVar.zzc();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String zzn() {
        return this.zzk;
    }

    public final synchronized String zzo() {
        Object objZzj;
        objZzj = zzj();
        return zzO(objZzj == null ? null : zza(objZzj));
    }

    public final void zzv() {
        this.zzi.clear();
    }

    public final synchronized void zzw() {
        mf.a aVarZzb;
        try {
            zzM();
            zzK();
            if (!this.zzl.get() && this.zzf.get() && this.zzi.size() < this.zze.f12132d) {
                this.zzl.set(true);
                Activity activityZza = n.D.f11581g.zza();
                if (activityZza == null) {
                    String strValueOf = String.valueOf(this.zze.f12129a);
                    int i10 = l0.f13401b;
                    k.g("Empty activity context at preloading: ".concat(strValueOf));
                    aVarZzb = zzb(this.zzb);
                } else {
                    aVarZzb = zzb(activityZza);
                }
                zzgdb.zzr(aVarZzb, new zzfkn(this), this.zzm);
            }
        } finally {
        }
    }

    public final synchronized void zzx(int i10) {
        e0.b(i10 >= 5);
        this.zzj.zzd(i10);
    }

    public final synchronized void zzy() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkp(this));
    }

    public final void zzz(zzfkd zzfkdVar) {
        this.zzp = zzfkdVar;
    }

    public zzfkv(String str, ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, u0 u0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        this(str, clientApi, context, i10, zzbpoVar, j3Var, scheduledExecutorService, zzfjyVar, aVar);
        this.zzg = u0Var;
    }

    private zzfkv(String str, ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzbpoVar;
        this.zze = j3Var;
        this.zzi = new PriorityQueue(Math.max(1, j3Var.f12132d), new zzfko(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfjyVar;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = aVar;
        zzfkj zzfkjVar = new zzfkj(j3Var.f12129a, fc.b.a(this.zze.f12130b));
        zzfkjVar.zzb(str);
        this.zzr = new zzfkl(zzfkjVar, null);
    }
}
