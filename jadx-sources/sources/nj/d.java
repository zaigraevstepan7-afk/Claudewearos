package nj;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f12350a;

    public d() {
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9/_]{0,100}$");
        fj.l.e(patternCompile, "compile(...)");
        this.f12350a = patternCompile;
    }

    public final String toString() {
        String string = this.f12350a.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }
}
