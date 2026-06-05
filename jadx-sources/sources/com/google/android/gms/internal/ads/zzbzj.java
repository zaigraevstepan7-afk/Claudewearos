package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import nc.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzj {
    private final ud.a zza;
    private final zzbzu zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzbzj(ud.a aVar, zzbzu zzbzuVar, String str, String str2) {
        this.zza = aVar;
        this.zzb = zzbzuVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzbzi) it.next()).zzb());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzbzi zzbziVar = new zzbzi(this);
                    zzbziVar.zzd();
                    this.zzc.add(zzbziVar);
                    this.zzi++;
                    zzbzu zzbzuVar = this.zzb;
                    zzbzuVar.zzf();
                    zzbzuVar.zze(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    LinkedList linkedList = this.zzc;
                    if (!linkedList.isEmpty()) {
                        zzbzi zzbziVar = (zzbzi) linkedList.getLast();
                        if (zzbziVar.zza() == -1) {
                            zzbziVar.zzc();
                            this.zzb.zze(this);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    ((ud.b) this.zza).getClass();
                    this.zzg = SystemClock.elapsedRealtime();
                    this.zzb.zze(this);
                }
                this.zzb.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z2) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    ((ud.b) this.zza).getClass();
                    this.zzh = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(q3 q3Var) {
        synchronized (this.zzd) {
            ((ud.b) this.zza).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzj = jElapsedRealtime;
            this.zzb.zzj(q3Var, jElapsedRealtime);
        }
    }

    public final void zzk(long j) {
        synchronized (this.zzd) {
            try {
                this.zzk = j;
                if (j != -1) {
                    this.zzb.zze(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
