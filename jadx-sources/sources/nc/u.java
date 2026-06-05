package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends zzays implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final fc.l f12239a;

    public u(fc.l lVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f12239a = lVar;
    }

    @Override // nc.g1
    public final void zzc() {
        fc.l lVar = this.f12239a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // nc.g1
    public final void zzd(h2 h2Var) {
        fc.l lVar = this.f12239a;
        if (lVar != null) {
            lVar.b(h2Var.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
            zzayt.zzc(parcel);
            zzd(h2Var);
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 != 4 && i10 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // nc.g1
    public final void zzf() {
        fc.l lVar = this.f12239a;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // nc.g1
    public final void zzb() {
    }

    @Override // nc.g1
    public final void zze() {
    }
}
