package com.google.android.gms.internal.ads;

import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbwz extends zzays implements zzbxa {
    public zzbwz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int i12 = parcel.readInt();
            zzayt.zzc(parcel);
            zze(i12);
        } else {
            if (i10 != 3) {
                return false;
            }
            h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
            zzayt.zzc(parcel);
            zzf(h2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
