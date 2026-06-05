package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import n7.a;
import n7.b;
import n7.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f857a;
        boolean z2 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f857a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f858b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f11905e);
        }
        remoteActionCompat.f858b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f859c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f11905e);
        }
        remoteActionCompat.f859c = charSequence2;
        remoteActionCompat.f860d = (PendingIntent) aVar.f(remoteActionCompat.f860d, 4);
        boolean z10 = remoteActionCompat.f861e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f11905e.readInt() != 0;
        }
        remoteActionCompat.f861e = z10;
        boolean z11 = remoteActionCompat.f862f;
        if (!aVar.e(6)) {
            z2 = z11;
        } else if (((b) aVar).f11905e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f862f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f857a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f858b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f11905e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f859c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f860d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f861e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = remoteActionCompat.f862f;
        aVar.h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
