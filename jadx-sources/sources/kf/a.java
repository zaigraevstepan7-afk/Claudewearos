package kf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f9552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9553b;

    public a(IBinder iBinder, String str) {
        this.f9552a = iBinder;
        this.f9553b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9552a;
    }

    public final void n(int i10, Parcel parcel) {
        try {
            this.f9552a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
