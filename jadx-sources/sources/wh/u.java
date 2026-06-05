package wh;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19387d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f19388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19390c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f19387d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(m1.j("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f19388a = strSubstring;
        this.f19389b = str;
        this.f19390c = m1.w(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f19388a.equals(uVar.f19388a) && this.f19389b.equals(uVar.f19389b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19389b, this.f19388a});
    }
}
