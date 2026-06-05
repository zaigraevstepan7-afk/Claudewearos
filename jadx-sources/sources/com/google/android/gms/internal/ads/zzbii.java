package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import fc.w;
import java.util.ArrayList;
import java.util.List;
import nc.s1;
import nc.t1;
import nc.x2;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbii {
    private final zzbih zza;
    private final zzbgo zzc;
    private final List zzb = new ArrayList();
    private final w zzd = new w();
    private final List zze = new ArrayList();

    public zzbii(zzbih zzbihVar) {
        zzbgn zzbglVar;
        this.zza = zzbihVar;
        zzbgo zzbgoVar = null;
        try {
            List listZzu = zzbihVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbglVar = iInterfaceQueryLocalInterface instanceof zzbgn ? (zzbgn) iInterfaceQueryLocalInterface : new zzbgl(iBinder);
                    } else {
                        zzbglVar = null;
                    }
                    if (zzbglVar != null) {
                        this.zzb.add(new zzbgo(zzbglVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    s1 s1VarN = obj2 instanceof IBinder ? x2.n((IBinder) obj2) : null;
                    if (s1VarN != null) {
                        this.zze.add(new t1(s1VarN));
                    }
                }
            }
        } catch (RemoteException e11) {
            k.e("", e11);
        }
        try {
            zzbgn zzbgnVarZzk = this.zza.zzk();
            if (zzbgnVarZzk != null) {
                zzbgoVar = new zzbgo(zzbgnVarZzk);
            }
        } catch (RemoteException e12) {
            k.e("", e12);
        }
        this.zzc = zzbgoVar;
        try {
            if (this.zza.zzi() != null) {
                new zzbgh(this.zza.zzi());
            }
        } catch (RemoteException e13) {
            k.e("", e13);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final w zza() {
        try {
            zzbih zzbihVar = this.zza;
            if (zzbihVar.zzh() != null) {
                this.zzd.a(zzbihVar.zzh());
            }
        } catch (RemoteException e10) {
            k.e("Exception occurred while getting video controller", e10);
        }
        return this.zzd;
    }

    public final ic.c zzb() {
        return this.zzc;
    }

    public final Double zzc() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final Object zzd() {
        try {
            xd.a aVarZzl = this.zza.zzl();
            if (aVarZzl != null) {
                return xd.b.u(aVarZzl);
            }
            return null;
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final List zzk() {
        return this.zzb;
    }
}
