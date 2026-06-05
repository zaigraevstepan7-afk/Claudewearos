package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import n7.a;
import n7.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f870a;
        if (aVar.e(1)) {
            i10 = ((b) aVar).f11905e.readInt();
        }
        iconCompat.f870a = i10;
        byte[] bArr = iconCompat.f872c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f11905e;
            int i11 = parcel.readInt();
            if (i11 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i11];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f872c = bArr;
        iconCompat.f873d = aVar.f(iconCompat.f873d, 3);
        int i12 = iconCompat.f874e;
        if (aVar.e(4)) {
            i12 = ((b) aVar).f11905e.readInt();
        }
        iconCompat.f874e = i12;
        int i13 = iconCompat.f875f;
        if (aVar.e(5)) {
            i13 = ((b) aVar).f11905e.readInt();
        }
        iconCompat.f875f = i13;
        iconCompat.f876g = (ColorStateList) aVar.f(iconCompat.f876g, 6);
        String string = iconCompat.f878i;
        if (aVar.e(7)) {
            string = ((b) aVar).f11905e.readString();
        }
        iconCompat.f878i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f11905e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f877h = PorterDuff.Mode.valueOf(iconCompat.f878i);
        switch (iconCompat.f870a) {
            case -1:
                Parcelable parcelable = iconCompat.f873d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f871b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f873d;
                if (parcelable2 != null) {
                    iconCompat.f871b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f872c;
                iconCompat.f871b = bArr3;
                iconCompat.f870a = 3;
                iconCompat.f874e = 0;
                iconCompat.f875f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f872c, Charset.forName("UTF-16"));
                iconCompat.f871b = str;
                if (iconCompat.f870a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f871b = iconCompat.f872c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f878i = iconCompat.f877h.name();
        switch (iconCompat.f870a) {
            case -1:
                iconCompat.f873d = (Parcelable) iconCompat.f871b;
                break;
            case 1:
            case 5:
                iconCompat.f873d = (Parcelable) iconCompat.f871b;
                break;
            case 2:
                iconCompat.f872c = ((String) iconCompat.f871b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f872c = (byte[]) iconCompat.f871b;
                break;
            case 4:
            case 6:
                iconCompat.f872c = iconCompat.f871b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f870a;
        if (-1 != i10) {
            aVar.h(1);
            ((b) aVar).f11905e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f872c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f11905e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f873d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f11905e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f874e;
        if (i11 != 0) {
            aVar.h(4);
            ((b) aVar).f11905e.writeInt(i11);
        }
        int i12 = iconCompat.f875f;
        if (i12 != 0) {
            aVar.h(5);
            ((b) aVar).f11905e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f876g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f11905e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f878i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f11905e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f11905e.writeString(str2);
        }
    }
}
