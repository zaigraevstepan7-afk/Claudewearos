package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends zzayr implements m1 {
    public k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // nc.m1
    public final float zze() {
        Parcel parcelZzda = zzda(7, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // nc.m1
    public final List zzg() {
        Parcel parcelZzda = zzda(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzda.createTypedArrayList(zzbmb.CREATOR);
        parcelZzda.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // nc.m1
    public final void zzk() {
        zzdb(1, zza());
    }

    @Override // nc.m1
    public final void zzl(String str, xd.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzayt.zzf(parcelZza, aVar);
        zzdb(6, parcelZza);
    }

    @Override // nc.m1
    public final void zzo(zzbpo zzbpoVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbpoVar);
        zzdb(11, parcelZza);
    }

    @Override // nc.m1
    public final void zzs(zzbmi zzbmiVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbmiVar);
        zzdb(12, parcelZza);
    }

    @Override // nc.m1
    public final void zzt(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(18, parcelZza);
    }

    @Override // nc.m1
    public final void zzu(k3 k3Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, k3Var);
        zzdb(14, parcelZza);
    }

    @Override // nc.m1
    public final boolean zzv() {
        Parcel parcelZzda = zzda(8, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
