package ld;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends zbb implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f10918a = i10;
        this.f10919b = gVar;
    }

    @Override // ld.j
    public void h(Status status) {
        switch (this.f10918a) {
            case 1:
                this.f10919b.setResult((g) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ld.j
    public void j(Status status) {
        switch (this.f10918a) {
            case 0:
                this.f10919b.setResult((g) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                j(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                h(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
