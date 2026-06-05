package com.google.android.gms.internal.ads;

import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbba extends zzays implements zzbbb {
    public zzbba() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
            zzayt.zzc(parcel);
            zzd(h2Var);
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
