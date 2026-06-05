package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfea {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfez zzd = new zzfez();

    public zzfea(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            zzfek zzfekVar = (zzfek) linkedList.getFirst();
            n.D.f11584k.getClass();
            if (System.currentTimeMillis() - zzfekVar.zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            linkedList.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfek zze() {
        zzfez zzfezVar = this.zzd;
        zzfezVar.zzf();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfek zzfekVar = (zzfek) linkedList.remove();
        if (zzfekVar != null) {
            zzfezVar.zzh();
        }
        return zzfekVar;
    }

    public final zzfey zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfek zzfekVar) {
        this.zzd.zzf();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfekVar);
        return true;
    }
}
