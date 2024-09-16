math.randomseed(os.time())

function random_user_id()
    return math.random(1, 50000)
end

request = function()
    local user_id = random_user_id()
    local url = "http://localhost:8080/user/" .. user_id
    return wrk.format(nil, url)
end