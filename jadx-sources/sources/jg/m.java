package jg;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaq;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final zzaq f8896a = zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b, reason: collision with root package name */
    public static final m f8897b = new m();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f3491a);
        editorEdit.putString("statusMessage", status.f3492b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzaq zzaqVar = f8896a;
        int size = zzaqVar.size();
        int i10 = 0;
        while (i10 < size) {
            E e10 = zzaqVar.get(i10);
            i10++;
            editorEdit.remove((String) e10);
        }
        editorEdit.commit();
    }
}
