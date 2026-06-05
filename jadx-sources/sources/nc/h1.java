package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 extends zzayr implements j1 {
    @Override // nc.j1
    public final zzbpo getAdapterCreator() {
        Parcel parcelZzda = zzda(2, zza());
        zzbpo zzbpoVarZzf = zzbpn.zzf(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbpoVarZzf;
    }

    @Override // nc.j1
    public final y2 getLiteSdkVersion() {
        Parcel parcelZzda = zzda(1, zza());
        y2 y2Var = (y2) zzayt.zza(parcelZzda, y2.CREATOR);
        parcelZzda.recycle();
        return y2Var;
    }
}
