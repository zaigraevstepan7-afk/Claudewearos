package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new dd.d(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f6831a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6832b;

    public a(int i10, Intent intent) {
        this.f6831a = i10;
        this.f6832b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f6831a;
        sb2.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f6832b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "dest");
        parcel.writeInt(this.f6831a);
        Intent intent = this.f6832b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
