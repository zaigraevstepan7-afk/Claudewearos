package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new dd.d(26);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6847c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6848d;

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        l.f(intentSender, "intentSender");
        this.f6845a = intentSender;
        this.f6846b = intent;
        this.f6847c = i10;
        this.f6848d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "dest");
        parcel.writeParcelable(this.f6845a, i10);
        parcel.writeParcelable(this.f6846b, i10);
        parcel.writeInt(this.f6847c);
        parcel.writeInt(this.f6848d);
    }
}
