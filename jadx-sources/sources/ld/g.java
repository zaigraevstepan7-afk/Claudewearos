package ld;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.p000authapi.zbc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, int i10) {
        super(fd.a.f6725a, pVar);
        this.f10920a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        int i10 = this.f10920a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f10920a) {
            case 0:
                e eVar = (e) bVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.f10917a;
                Parcel parcelZba = kVar.zba();
                zbc.zbd(parcelZba, fVar);
                zbc.zbc(parcelZba, googleSignInOptions);
                kVar.zbb(102, parcelZba);
                break;
            default:
                e eVar2 = (e) bVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.f10917a;
                Parcel parcelZba2 = kVar2.zba();
                zbc.zbd(parcelZba2, fVar2);
                zbc.zbc(parcelZba2, googleSignInOptions2);
                kVar2.zbb(103, parcelZba2);
                break;
        }
    }
}
