package p7;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f12814d;

    public l() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f12814d = Pattern.compile("\\A\\d+");
    }

    @Override // p7.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // p7.c
    public final boolean b() {
        boolean zB = super.b();
        if (!zB || Build.VERSION.SDK_INT >= 29) {
            return zB;
        }
        int i10 = o7.e.f12424a;
        PackageInfo packageInfoA = d.a();
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f12814d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
