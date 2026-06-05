package ce;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF5;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0[] f3250a = {new e0("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<e0> CREATOR = new ae.b(17);

    public static e0 a(String str) throws d0 {
        for (e0 e0Var : values()) {
            e0Var.getClass();
            if (str.equals("public-key")) {
                return e0Var;
            }
        }
        throw new d0(m1.j("PublicKeyCredentialType ", str, " not supported"));
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f3250a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
