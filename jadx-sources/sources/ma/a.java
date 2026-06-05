package ma;

import android.content.Context;
import android.content.pm.PackageManager;
import fj.l;
import java.util.Locale;
import nj.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f11433a;

    public a(Context context) {
        l.f(context, "context");
        this.f11433a = context.getPackageManager();
    }

    public static final String a(a aVar, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l.e(lowerCase, "toLowerCase(...)");
        if (e.C0(lowerCase, "facebook", false) || e.C0(lowerCase, "instagram", false) || e.C0(lowerCase, "twitter", false) || e.C0(lowerCase, "tiktok", false) || e.C0(lowerCase, "snapchat", false) || e.C0(lowerCase, "reddit", false) || e.C0(lowerCase, "linkedin", false)) {
            return "social";
        }
        if (e.C0(lowerCase, "whatsapp", false) || e.C0(lowerCase, "telegram", false) || e.C0(lowerCase, "messenger", false) || e.C0(lowerCase, "signal", false) || e.C0(lowerCase, "discord", false) || e.C0(lowerCase, "slack", false) || e.C0(lowerCase, "teams", false)) {
            return "communication";
        }
        if (e.C0(lowerCase, "youtube", false) || e.C0(lowerCase, "netflix", false) || e.C0(lowerCase, "spotify", false) || e.C0(lowerCase, "twitch", false) || e.C0(lowerCase, "hulu", false) || e.C0(lowerCase, "disney", false)) {
            return "entertainment";
        }
        if (e.C0(lowerCase, "prime", false) && e.C0(lowerCase, "video", false)) {
            return "entertainment";
        }
        if (e.C0(lowerCase, "music", false) || e.C0(lowerCase, "spotify", false) || e.C0(lowerCase, "soundcloud", false) || e.C0(lowerCase, "deezer", false) || e.C0(lowerCase, "tidal", false)) {
            return "music";
        }
        if (e.C0(lowerCase, "camera", false) || e.C0(lowerCase, "photo", false) || e.C0(lowerCase, "gallery", false) || e.C0(lowerCase, "lightroom", false) || e.C0(lowerCase, "snapseed", false) || e.C0(lowerCase, "vsco", false)) {
            return "photography";
        }
        if (e.C0(lowerCase, "amazon", false) || e.C0(lowerCase, "ebay", false) || e.C0(lowerCase, "shop", false) || e.C0(lowerCase, "store", false) || e.C0(lowerCase, "aliexpress", false) || e.C0(lowerCase, "wish", false)) {
            return "shopping";
        }
        String str2 = "finance";
        if (!e.C0(lowerCase, "bank", false) && !e.C0(lowerCase, "paypal", false) && !e.C0(lowerCase, "venmo", false) && !e.C0(lowerCase, "wallet", false) && !e.C0(lowerCase, "finance", false) && !e.C0(lowerCase, "crypto", false)) {
            str2 = "travel";
            if (!e.C0(lowerCase, "maps", false) && !e.C0(lowerCase, "uber", false) && !e.C0(lowerCase, "lyft", false) && !e.C0(lowerCase, "airbnb", false) && !e.C0(lowerCase, "booking", false) && !e.C0(lowerCase, "travel", false)) {
                return (e.C0(lowerCase, "health", false) || e.C0(lowerCase, "fitness", false) || e.C0(lowerCase, "workout", false) || e.C0(lowerCase, "strava", false) || e.C0(lowerCase, "fitbit", false)) ? "health" : (e.C0(lowerCase, "office", false) || e.C0(lowerCase, "docs", false) || e.C0(lowerCase, "sheets", false) || e.C0(lowerCase, "slides", false) || e.C0(lowerCase, "drive", false) || e.C0(lowerCase, "dropbox", false) || e.C0(lowerCase, "notion", false) || e.C0(lowerCase, "evernote", false) || e.C0(lowerCase, "calendar", false) || e.C0(lowerCase, "notes", false)) ? "productivity" : (e.C0(lowerCase, "calculator", false) || e.C0(lowerCase, "clock", false) || e.C0(lowerCase, "flashlight", false) || e.C0(lowerCase, "file", false) || e.C0(lowerCase, "cleaner", false) || e.C0(lowerCase, "manager", false)) ? "tools" : (e.C0(lowerCase, "game", false) || (e.C0(lowerCase, "play", false) && e.C0(lowerCase, "games", false))) ? "games" : (e.C0(lowerCase, "news", false) || e.C0(lowerCase, "bbc", false) || e.C0(lowerCase, "cnn", false) || e.C0(lowerCase, "reuters", false)) ? "news" : e.C0(lowerCase, "weather", false) ? "weather" : "other";
            }
        }
        return str2;
    }
}
