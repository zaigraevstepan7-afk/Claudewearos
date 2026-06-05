package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends Binder implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12580b;

    public f(a aVar) {
        this.f12580b = aVar;
        attachInterface(this, b.a.f1262h);
        this.f12579a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.a.f1262h;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f12579a;
        a aVar = this.f12580b;
        switch (i10) {
            case 2:
                int i12 = parcel.readInt();
                Bundle bundle = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b8.e(this, i12, bundle, 2));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i13 = parcel.readInt();
                Uri uri = (Uri) cg.b.d(parcel, Uri.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, i13, uri, z2, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) cg.b.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                Bundle bundle6 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b8.d(this, i14, i15, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 2));
                    return true;
                }
                return true;
            case 10:
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                int i20 = parcel.readInt();
                Bundle bundle8 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i16, i17, i18, i19, i20, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) cg.b.d(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
